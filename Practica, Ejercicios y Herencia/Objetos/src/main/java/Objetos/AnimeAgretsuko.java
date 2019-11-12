/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author anita
 */
public class AnimeAgretsuko {
    
    private String personajePrincipal;
    private String amigadelPerPri;
    private String conQuienLosFansQuierenChippearAlPerPrincipal;

    public AnimeAgretsuko(String personajePrincipal, String amigadelPerPri, String conQuienLosFansQuierenChippearAlPerPrincipal) {
        this.personajePrincipal = personajePrincipal;
        this.amigadelPerPri = amigadelPerPri;
        this.conQuienLosFansQuierenChippearAlPerPrincipal = conQuienLosFansQuierenChippearAlPerPrincipal;
    }
    
    public AnimeAgretsuko() {
        this.personajePrincipal = "Retsuko";
        this.amigadelPerPri = "Fenneko";
        this.conQuienLosFansQuierenChippearAlPerPrincipal = "Haida";
    }
    
    public String quienCanta()
    {
        return personajePrincipal;
    }
    
    public String conQuienDeberiaQuedarse()
    {
        return conQuienLosFansQuierenChippearAlPerPrincipal;
    }
    
    public void otrosPersonajesChidos()
    {
        System.out.println("Gory y Washimi pero me dio flojera declararlos");
    }

    public String getPersonajePrincipal() {
        return personajePrincipal;
    }

    public String getAmigadelPerPri() {
        return amigadelPerPri;
    }

    public String getConQuienLosFansQuierenChippearAlPerPrincipal() {
        return conQuienLosFansQuierenChippearAlPerPrincipal;
    }

    public void setPersonajePrincipal(String personajePrincipal) {
        this.personajePrincipal = personajePrincipal;
    }

    public void setAmigadelPerPri(String amigadelPerPri) {
        this.amigadelPerPri = amigadelPerPri;
    }

    public void setConQuienLosFansQuierenChippearAlPerPrincipal(String conQuienLosFansQuierenChippearAlPerPrincipal) {
        this.conQuienLosFansQuierenChippearAlPerPrincipal = conQuienLosFansQuierenChippearAlPerPrincipal;
    }

    @Override
    public String toString() {
        return "AnimeAgretsuko{" + "personajePrincipal=" + personajePrincipal + ", amigadelPerPri=" + amigadelPerPri + ", conQuienLosFansQuierenChippearAlPerPrincipal=" + conQuienLosFansQuierenChippearAlPerPrincipal + '}';
    }
    
    
    
    
}
