
public class Aplicacao {
  private Conteudo[] conteudos = new Conteudo[15];
  private String[] professores = new String[30];
  private String[] resumoes = new String[150];
  private Aluno[] alunos = new Aluno[26000];
  
  public Conteudo[] getConteudos() {
    return conteudos;
  }
  public String[] getProfessores() {
    return professores;
  }
  public String[] getResumoes() {
    return resumoes;
  }
  public Aluno[] getAlunos() {
    return alunos;
  }
  public void setConteudos(Conteudo[] conteudos) {
    this.conteudos = conteudos;
  }
  public void setProfessores(String[] professores) {
    this.professores = professores;
  }
  public void setResumoes(String[] resumoes) {
    this.resumoes = resumoes;
  }
  public void setAlunos(Aluno[] alunos) {
    this.alunos = alunos;
  }

  

}
