public class Conteudo {
  private String materia;
  private Exercicio[] exercicios = new Exercicio[2000];
  private Aula[] aulas = new Aula[50];
  
  public String getMateria() {
    return materia;
  }
  public Exercicio[] getExercicios() {
    return exercicios;
  }
  public Aula[] getAulas() {
    return aulas;
  }
  public void setMateria(String materia) {
    this.materia = materia;
  }
  public void setExercicios(Exercicio[] exercicios) {
    this.exercicios = exercicios;
  }
  public void setAulas(Aula[] aulas) {
    this.aulas = aulas;
  }

  
}
