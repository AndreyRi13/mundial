package ufps.edu.co.dao;

import ufps.edu.co.model.Jugador;
import ufps.edu.co.model.JugadorPK;
import ufps.edu.co.util.Conexion;

public class JugadorPKDao  extends Conexion<JugadorPK> implements GenericDao<JugadorPK> {

public JugadorPKDao() {	
super(JugadorPK.class);}

}


