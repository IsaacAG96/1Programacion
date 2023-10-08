/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package base_datos;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;
import java.sql.SQLException;

/**
 *
 * @author DAW
 */
public class Base_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner lector = new Scanner(System.in);
            String nombre_base;
            String ip;
            String nombre_tabla;

            System.out.println("Introduce tu ip");//la actual es 10.230.109.219
            ip = lector.next();

            System.out.println("Introduce el nombre de tu base de datos");//Nba
            nombre_base = lector.next();

// Cargamos la clase que implementa el Driver
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
// Creamos una nueva conexión a la base de datos elegida
            String url = "jdbc:mysql://" + ip + ":3306/" + nombre_base + "?serverTimezone=UTC";
            Connection conexion = DriverManager.getConnection(url, "root", "");
// Obtenemos un Statement de la conexión
            Statement st = conexion.createStatement();
// Ejecutamos una consulta SELECT para obtener la tabla vendedores
            System.out.println("Introduce el nombre de la tabla que quieras visualizar por completo");
            nombre_tabla = lector.next();
            String comando_mysql = "SELECT * FROM " + nombre_tabla;
            ResultSet consulta = st.executeQuery(comando_mysql);

// Recorremos todo el ResultSet y mostramos sus datos
            if ("Nba".equals(nombre_base)) {

                if ("equipos".equals(nombre_tabla)) {
                    while (consulta.next()) {

                        String nombre = consulta.getString("Nombre");
                        String ciudad = consulta.getString("Ciudad");
                        String conferencia = consulta.getString("Conferencia");
                        String division = consulta.getString("Division");
                        System.out.println("Nombre: " + nombre + " | " + "Ciudad: " + ciudad + " | " + "Conferencia: " + conferencia + " | " + "Division: " + division);

                    }
                } else if ("estadisticas".equals(nombre_tabla)) {   //SE HA COMENTADO ALGUNAS QUE NO ES CAPAZ DE LEER EN LA BASE DE DATOS
                    while (consulta.next()) {
                        String temporada = consulta.getString("Temporada");
                        int jugador = consulta.getInt("Jugador");
                        float puntos_por_partido = consulta.getFloat("Puntos_por_partido");
                        float asistencias_por_partido = consulta.getFloat("Asistencias_por_partido");
                        float tapones_por_partido = consulta.getFloat("Tapones_por_partido");
                        float rebotes_por_partido = consulta.getFloat("Rebotes_por_partido");
                        System.out.println("Temporada: " + temporada + " | " + "Jugador:  " + " | " + jugador + "Puntos por Partido: " + puntos_por_partido + " | " + "Asistencias por partido: " + asistencias_por_partido + " | " + "Tapones por partido: " + tapones_por_partido + " | " + "Rebotes por partido: " + rebotes_por_partido);
                    }

                } else if ("jugadores".equals(nombre_tabla)) {
                    while (consulta.next()) {
                        int codigo = consulta.getInt("Codigo");
                        String nombre = consulta.getString("Nombre");
                        String procedencia = consulta.getString("Procedencia");
                        String altura = consulta.getString("Altura");
                        int peso = consulta.getInt("Peso");
                        String posicion = consulta.getString("Posicion");
                        String nombre_equipo = consulta.getString("Nombre_equipo");

                        System.out.println("Codigo: " + codigo + " | " + "Nombre: " + " | " + nombre + "Procedencia: " + procedencia + " | " + "Altura: " + altura + " | " + "Peso: " + peso + " | " + "Posicion: " + posicion + " | " + "Nombre del equipo: " + nombre_equipo);
                    }

                } else if ("partidos".equals(nombre_tabla)) {
                    while (consulta.next()) {
                        int codigo = consulta.getInt("Codigo");
                        String equipo_local = consulta.getString("Equipo_Local");
                        String equipo_visitante = consulta.getString("Equipo_Visitante");
                        int puntos_local = consulta.getInt("Puntos_Local");
                        int puntos_visitante = consulta.getInt("Puntos_Visitante");
                        String temporada = consulta.getString("Temporada");
                        System.out.println("Codigo: " + codigo + " | " + "Equipo Local: " + equipo_local + " | " + "Equipo Visitante: " + equipo_visitante + " | " + "Puntos Local: " + puntos_local + " | " + "Puntos Visitante: " + puntos_visitante + " | " + "Temporada: " + temporada);
                    }
                }
            } else {
                System.out.println("Base de datos no encontrada");
            }
// Cerramos el statement y la conexión
            st.close();
            conexion.close();
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println("Excepcion: " + e);
        }

    }
}