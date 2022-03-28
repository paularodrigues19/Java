package com.mycompany.nivelamento6;

public class RecursosHumanos {
    
    private Double totalPromovidos;
    private Double salariosReajustados;
    
    void reajustarSalario(Colaborador utilColaborador, Double valorReajuste){
        }; 
    
    Boolean promoverColaborador(Colaborador utilColaborador, String novoCargo, 
            Double novoSalario) {
            
        if (utilColaborador.getSalario() > novoSalario) {
            System.out.println(String.format("O novo salário do colaborador %s é"
                    + " %.2f", utilColaborador.getNome(), novoSalario));
            return true;
        } else {
            System.out.println("Operação Inválida");
            return false;
        }
    }

    public Double getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Double totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Double getSalariosReajustados() {
        return salariosReajustados;
    }

    public void setSalariosReajustados(Double salariosReajustados) {
        this.salariosReajustados = salariosReajustados;
    }

}
