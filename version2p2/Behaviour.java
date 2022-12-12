import java.io.*; 

/* package: Class Diagram */ 
/******************************
* Copyright (c) 2003--2021 Kevin Lano
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License 2.0 which is available at
* http://www.eclipse.org/legal/epl-2.0
*
* SPDX-License-Identifier: EPL-2.0
* *****************************/

public class Behaviour
{ Entity behaviouredClassifier = null; 
  BehaviouralFeature specification = null; 
  UseCase uc = null; 
  /* A behaviour is the activity for exactly one of these three kinds of model element */ 

  Statement code; 

  public Behaviour(Entity ent, Statement cde)
  { behaviouredClassifier = ent; 
    code = cde; 
  } 

  public Behaviour(Entity owner, BehaviouralFeature bf, Statement cde)
  { behaviouredClassifier = owner; 
    specification = bf; 
    code = cde; 
  } 

  public Behaviour(UseCase u, Statement cde)
  { uc = u; 
    code = cde; 
  } 

  public String getName()
  { if (behaviouredClassifier != null) 
    { return behaviouredClassifier.getName(); } 
    else if (specification != null) 
    { return specification.getName(); } 
    else if (uc != null) 
    { return uc.getName(); } 
    return "application"; 
  } 

  public void setUseCase(UseCase ucase)
  { uc = ucase; } 

  public Entity getEntity()
  { return behaviouredClassifier; } 

  public BehaviouralFeature getOperation()
  { return specification; } 

  public void saveData(PrintWriter out)
  { String opname = "null"; 
    if (specification != null) 
    { opname = specification.getName(); } 
    out.println("Activity:");
    if (behaviouredClassifier != null) 
    { out.println(behaviouredClassifier.getName() + " " + opname); } 
    else if (uc != null) 
    { out.println(uc.getName()); }
    else 
    { out.println("application"); }    
    out.println(code); 
    out.println(""); 
  } 


  public static void saveUseCaseActivity(String nme, Statement stat, PrintWriter out)
  { 
    out.println("Activity:");
    out.println(nme); 
    out.println(stat); 
    out.println(""); 
  } 


  public String toString()
  { String res = "Activity of "; 
    if (behaviouredClassifier != null) 
    { res = res + " classifier " + behaviouredClassifier.getName(); } 
    if (uc != null) 
    { res = res + " use case " + uc.getName(); }  
    if (specification != null) 
    { res = res + " of operation " + specification.getName(); } 
    return res + " " + code; 
  } 
}
  