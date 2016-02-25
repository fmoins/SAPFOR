/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Christophe
 */
public class Agent {
    private String matricule;
    private String nom;
    private String prenom;
    private List<Session> listeSessionsApprenant;
    private List<Session> listeSessionsFormateur;
   // private List<Stage> listeStagesDirecteur;
    
    public static Agent nouvelAgent(String mat, String surname, String firstname, 
                List<Session> listApprenant, List<Session> listFormateur){
                    Agent agent = new Agent();
                    agent.matricule = mat;
                    agent.nom = surname;
                    agent.prenom = firstname;
                    agent.listeSessionsApprenant = listApprenant;
                    agent.listeSessionsFormateur = listFormateur;
                    return agent;
                }
                
    private Agent(){
        super();
    }
}
