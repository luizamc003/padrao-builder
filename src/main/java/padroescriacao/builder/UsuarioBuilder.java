package padroescriacao.builder;

import java.util.Date;

public class UsuarioBuilder {

    private Usuario usuario;

    public UsuarioBuilder() {
        usuario = new Usuario();
    }

    public Usuario build() {
        if (usuario.getEmail().equals("")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
        if (usuario.getSenha().equals("")) {
            throw new IllegalArgumentException("Senha inválida");
        }
        return usuario;
    }

    public UsuarioBuilder setEmail(String email) {
        usuario.setEmail(email);
        return this;
    }

    public UsuarioBuilder setSenha(String senha) {
        usuario.setSenha(senha);
        return this;
    }

    public UsuarioBuilder setNome(String nome) {
        usuario.setNome(nome);
        return this;
    }

    public UsuarioBuilder setCpf(String cpf) {
        usuario.setCpf(cpf);
        return this;
    }

    public UsuarioBuilder setCelular(String celular) {
        usuario.setCelular(celular);
        return this;
    }

    public UsuarioBuilder setDataNascimento(Date dataNascimento) {
        usuario.setDataNascimento(dataNascimento);
        return this;
    }

    public UsuarioBuilder setEndereco(String endereco) {
        usuario.setEndereco(endereco);
        return this;
    }

    public UsuarioBuilder setCidade(String cidade) {
        usuario.setCidade(cidade);
        return this;
    }

    public UsuarioBuilder setCep(String cep) {
        usuario.setCep(cep);
        return this;
    }
}