package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.model.Credencial;
import com.model.Usuario;

class TestUsuario {


	@Test
	void testConstructorUsuarioConNombreApellidoContraseña() {
		Usuario u1 = new Usuario("Miguel", "Larinto", "12345");
		assertEquals("Miguel", u1.getNombre());
		assertEquals("Larinto", u1.getApellidos());
	}

	@Test
	void testUsuarioStringStringStringString() {
		Usuario u2 = new Usuario("Alex", "Garcia", "alexgarcia@gmail.com", "54321");
		assertEquals("Alex", u2.getNombre());
		assertEquals("Garcia", u2.getApellidos());
		assertEquals("alexgarcia@gmail.com", u2.getEmail());
	}

	@Test
	void testEsCuentaNoBloqueada() {
		Usuario u1 = new Usuario("Miguel", "Larinto", "12345");
		assertTrue(u1.hacerLogin("MiLa102", "12345"));
	}
	
	@Test
	void testEsCuentaBloqueada() {
		Usuario u3 = new Usuario("Miguel", "Larinto", "12345");
		Credencial c2 = new Credencial("Miguel", "Larinto", "12345");
		u3.hacerLogin("MirLa100", "12345");
		u3.hacerLogin("MirLea100", "12345");
		u3.hacerLogin("MirLaa100", "12345");
		u3.hacerLogin("MirLaa100", "12345");
		assertTrue(u3.esCuentaBloqueada());
	}
	/*
	 * Este test debe de fallar debido a que el codigo de modificar constraseña 
	 * no esta terminado
	 * */
	@Test
	void testModificarPassword() {
		 Usuario u1 = new Usuario("Miguel", "Larinto", "12345");
		    boolean resultado = u1.modificarPassword("newPassword123$", "12345", "newPassword123$");
		    assertTrue(resultado);

		    resultado = u1.modificarPassword("newPassword123$", "wrongOldPassword", "newPassword123$");
		    assertFalse(resultado);

		    resultado = u1.modificarPassword("newPassword123$", "12345", "wrongVerification");
		    assertFalse(resultado);
	}

	@Test
	void testEsPasswordSegura() {
	}

	@Test
	void testHacerLogin() {
	}

}
