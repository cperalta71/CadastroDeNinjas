package dev.java10x.CadastroDeNinjas.Ninjas.Model;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //Muitos ninjas terao uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreign key para relacionar tb_cadastro e tb_missoes
    private MissoesModel missoes;

}
