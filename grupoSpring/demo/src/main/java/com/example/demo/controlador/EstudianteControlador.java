package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.servicio.EstudianteService;

@Controller
public class EstudianteControlador {
    @Autowired
    private EstudianteService servicio;

    @GetMapping("/estudiantes")
    public String listarEstudiantes(Model modelo){
        modelo.addAttribute("estudiantes",servicio.listarEstudiantes());
        return "index";
    }

    @GetMapping("/estudiantes/nuevo")
    public String crearEstudianteFormulario(Model modelo){
        Estudiante estudiante = new Estudiante();
        modelo.addAttribute("estudiante", estudiante);
        return "formulario";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        servicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id,Model modelo){
        modelo.addAttribute("estudiante", servicio.obtenerEstudiantePorId(id));
        return "formularioEditar";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable long id,@ModelAttribute("estudiante") Estudiante estudiante,Model modelo){
        Estudiante estudianteExistente = servicio.obtenerEstudiantePorId(id);
        estudianteExistente.setId(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setTelefono(estudiante.getTelefono());
        servicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable Long id){
        servicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }

}
