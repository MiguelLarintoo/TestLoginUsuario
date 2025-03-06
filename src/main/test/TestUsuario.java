package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
	void testEsCuentaBloqueada() {
	}

	@Test
	void testModificarPassword() {
	}

	@Test
	void testEsPasswordSegura() {
	}

	@Test
	void testHacerLogin() {
	}

}
