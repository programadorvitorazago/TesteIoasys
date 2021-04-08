/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.testeioasys.repositorio.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import local.testeioasys.repositorio.entidade.base.Filme__Base;

/**
 *
 * @author Vitor
 */
@Entity
@Table(name="tbl_filme")
@XmlRootElement
public class Filme extends Filme__Base {
       
}
