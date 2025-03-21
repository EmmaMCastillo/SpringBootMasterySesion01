package com.tdx.sesion1.Models;

public class EmpleadoModel {
    private String nombre;
    private String direccion;
    private String noIdentificacion;
    private String correoElectronico;
    private int edad;
    private double salario;

    public EmpleadoModel(String nombre, String direccion, String noIdentificacion, String correoElectronico, int edad, double salario){
        this.nombre = nombre;
        this.direccion = direccion;
        this.noIdentificacion = noIdentificacion;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
        this.salario= salario;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public String getDireccion(){
        return  this.direccion;
    }

    public String getNoIdentificacion(){
        return  this.noIdentificacion;
    }

    public  String getCorreoElectronico(){
        return  this.correoElectronico;
    }

    public int getEdad(){
        return  this.edad;
    }
    public double getSalario (){
        return  this.salario;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void  setNoIdentificacion(String noIdentificacion){
        this.noIdentificacion = noIdentificacion;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
