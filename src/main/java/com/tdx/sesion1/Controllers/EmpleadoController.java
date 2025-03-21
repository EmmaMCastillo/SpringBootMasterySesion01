package com.tdx.sesion1.Controllers;

import com.tdx.sesion1.Models.EmpleadoModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private final List<EmpleadoModel> empleados = new ArrayList<>();

    @PostMapping("/insertar")
    public String insertarEmpleado (@RequestBody EmpleadoModel empleado){
        empleados.add(empleado);
        return "Empleado agregado correctamente";
    }

    @GetMapping("/listar")
    public List<EmpleadoModel> listaEmpleado(){
        return  empleados;
    }

}
