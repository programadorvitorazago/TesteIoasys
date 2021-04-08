/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.testeioasys.repositorio.entidade;

import javax.persistence.Entity;
import javax.persistence.Table;
import local.testeioasys.repositorio.entidade.base.Ranking__Base;

/**
 *
 * @author Vitor
 */
@Entity
@Table(name = "tbl_ranking")
public class Ranking extends Ranking__Base{
    
}
