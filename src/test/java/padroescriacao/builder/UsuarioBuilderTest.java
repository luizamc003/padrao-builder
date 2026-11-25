package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioBuilderTest {

    @Test
    void deveRetornarExcecaoParaUsuarioSemEmail() {
        try {
            UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
            Usuario usuario = usuarioBuilder
                    .setSenha("senha123")
                    .setNome("Usuario 1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("E-mail inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaUsuarioSemSenha() {
        try {
            UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
            Usuario usuario = usuarioBuilder
                    .setEmail("usuario1@email.com")
                    .setNome("Usuario 1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Senha inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarUsuarioValido() {
        UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
        Usuario usuario = usuarioBuilder
                .setEmail("usuario1@email.com")
                .setSenha("senha123")
                .setNome("Usuario 1")
                .build();

        assertNotNull(usuario);
    }
}