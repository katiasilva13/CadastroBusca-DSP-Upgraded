package Trabalho;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Dani
 */
public class Cadastro {

    private String nome;
    private String dataNasc;
    private String telefone;
    private String cep;
    private String endereco;
    private String numCasa;
    private String cidade;
    private String uf;

    Cadastro(String nome, String dataNasc, String telefone, String cep, String endereco, String numCasa, String cidade, String uf) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.cep = cep;
        this.endereco = endereco;
        this.numCasa = numCasa;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String gravar() throws IOException {

        OutputStream fw = new FileOutputStream("src\\cadastro.txt", true);
        OutputStreamWriter osw = new OutputStreamWriter(fw);
        GeradorId id = new GeradorId();
        try (BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write("ID: " + id.getNextId() + ", ");
            bw.write("Nome: " + this.nome + ", ");
            bw.write("Data de Nascimento: " + this.dataNasc + ", ");
            bw.write("Telefone: " + this.telefone + ", ");
            bw.write("Cep: " + this.cep + ", ");
            bw.write("Endereço: " + this.endereco + ", ");
            bw.write("Nº: " + this.numCasa + ", ");
            bw.write("Cidade: " + this.cidade + ", ");
            bw.write("UF: " + this.uf + "; \n");
            bw.flush();
            bw.close();
            fw.close();

        }
        return "Dados Gravados";

    }

}
