package com.mycompany.nivelamento6;

public class TreinadorPokemon {
    private String nome;
    private Double nivel = 0.0;
    
    public void treinarPokemon(Pokemon utilPokemon) {
        utilPokemon.setForca(utilPokemon.getForca() * 1.1);
        utilPokemon.setDoces(utilPokemon.getDoces() + 10.0);
        setNivel(getNivel() + 2.0);
    };
    
    public Boolean evoluirPokemon(Pokemon utilPokemon, String nomeEvolucao) {
        
        if(utilPokemon.getDoces() > 50) {
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", 
                    utilPokemon.getNome(), nomeEvolucao));
        return true;
        
        } else {
            System.out.println("Não foi possível realizar operação");
        return false;    
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }
    
}
