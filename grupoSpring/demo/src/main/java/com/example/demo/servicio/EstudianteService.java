package com.example.demo.servicio;
import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface EstudianteService {
    public List<Estudiante> listarEstudiantes();
    public Estudiante guardarEstudiante(Estudiante estudiante);
    public Estudiante obtenerEstudiantePorId(Long id);
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Long id);
}
