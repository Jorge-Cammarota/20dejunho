
public class Main {
    public static void main(String[] args) {

        Coordenadores coordenadores = new Coordenadores("Marcos", 586551, 432, "UFRN", 11900.0);
        FuncionariosAdm adm = new FuncionariosAdm("Carlos Pedro", 92565, 882, "UFRN", 6500.0);
        Professores professor1 = new Professores("Meire", "12358965",69854, "UFRN", 30000.0);
        coordenadores.getProfSupervisionados().add(professor1);
        adm.senioridade = "Senior";
        adm.funcaoAdministrativa = "Financeiro";
        System.out.println(coordenadores);
        coordenadores.mostrarInfos();;
        coordenadores.reembolsoDespesas();
    }
}