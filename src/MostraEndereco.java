public class MostraEndereco {
    private String cep;
    private String rua;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    public MostraEndereco(Endereco endereco) {
        this.cep = endereco.cep();
        this.rua = endereco.logradouro();
        this.complemento = endereco.complemento();
        this.bairro = endereco.bairro();
        this.cidade = endereco.localidade();
        this.uf = endereco.uf();
    }

    @Override
    public String toString() {
        return "CEP: " + cep + "\n" + rua + " " + complemento + " " + bairro + "\n" + cidade + " - " + uf;
    }
}
