/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.enumeracao;

/**
 *
 * @author Anderson
 */
public enum EnumTiposChamados 
{
    TROCARPERIFERICO("TROCAR PERIFÉRICO"),
    PEGARPERIFERICO("PEGAR PERIFÉRICO"),
    LEVARPERIFERICO("LEVAR PERIFÉRICO"),
    MANUTENÇÃO("MANUTENÇÃO"),
    FALHA("FALHAS COM PROGRAMAS"),
    DUVIDA("DUVIDA COM PROGRAMAS"),
    INTERNET("INTERNET");
    
    public String opcao;
    
    EnumTiposChamados(String opcao)
    {   this.opcao = opcao; }
    
    public String getOpcao()
    {   return this.opcao;  }
    
    public String getOpcaoParaMenu()
    {   
        String aux = "" + opcao.charAt(0);
        aux += opcao.substring(1).toLowerCase();
        return aux;
    }
}
