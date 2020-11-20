package ufps.edu.co.dao;

import ufps.edu.co.model.Jugador;
import ufps.edu.co.util.Conexion;


public class JugadorDao extends Conexion<Jugador> implements GenericDao<Jugador> {

public JugadorDao() {	
super(Jugador.class);}

}

