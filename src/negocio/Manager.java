package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import datos.Refugiado;

public class Manager {
	
	
	public void registrarRefugiadoAdmin(Refugiado refugiado,Connection con) throws SQLException
	{
		PreparedStatement stmt = con.prepareStatement("INSERT INTO refugiados (nombre,apellido,sexo,altura,peso,estado_civil,fecha_nacimiento,lugar_registro,localizacion_actual,nacionalidad,telefono,ciudad_origen,email,nombre_usuario,pass) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
		
		stmt.setString(1, refugiado.getNombre());
		stmt.setString(2, refugiado.getApellido());
		stmt.setString(3, refugiado.getSexo());
		stmt.setFloat(4, refugiado.getAltura());
		stmt.setFloat(5, refugiado.getPeso());
		stmt.setString(6, refugiado.getEstado_civil());
		stmt.setString(7, refugiado.getFecha_nacimiento());
		stmt.setString(8, refugiado.getLugar_registro());
		stmt.setString(9, refugiado.getLocalizacion_actual());
		stmt.setString(10, refugiado.getNacionalidad());
		stmt.setString(11, refugiado.getTelefono());
		stmt.setString(12, refugiado.getCiudad_origen());
		stmt.setString(13, refugiado.getEmail());
		stmt.setString(14, refugiado.getNombre_usuario());
		stmt.setString(15, refugiado.getPass());
		
		
		
		stmt.executeUpdate();
		
	}
	
	public void borrarRefugiado()
	{
		
	}
	
	public void buscarRefugiado()
	{
		
	}
	


}
