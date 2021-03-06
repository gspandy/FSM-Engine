/**
 * 
 */
package gr.ekt.fsmengine.api;

/**
 * Maintains a reference to the current State. Within the classes that implement 
 * this interface, State is represented via a <del>simple String</del> a StateName enum, 
 * since typically it will have to be persisted in the database, and therefore using a 
 * regular object would introduce unnecessary complexities to the app.
 * 
 * @author Dimitris Zavaliadis
 */
public interface StateContext {
    
    String getStateName();
    
    void setStateName(String stateName);    
    
    boolean isDone();
    
    StateContext getParent();
}
