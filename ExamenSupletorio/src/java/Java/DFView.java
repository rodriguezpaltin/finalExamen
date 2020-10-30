/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author USUARIO
 */
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

@RequestScoped
public class DFView {
     
    public void viewCars() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        //PrimeFaces.current().dialog().openDynamic("viewCars", options, null);
    }
     
    public void viewCarsCustomized() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("width", 640);
        options.put("height", 340);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
        options.put("headerElement", "customheader");
         
        //PrimeFaces.current().dialog().openDynamic("viewCars", options, null);
    }
     
    public void chooseCar() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        options.put("draggable", false);
        options.put("modal", true);
        //PrimeFaces.current().dialog().openDynamic("selectCar", options, null);
    }
     
    public void onCarChosen(SelectEvent event) {
        ///Car car = (Car) event.getObject();
        //FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected", "Id:" + car.getId());
         
        //FacesContext.getCurrentInstance().addMessage(null, message);
    }
     
    public void showMessage() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "What we do in life", "Echoes in eternity.");
         
        //PrimeFaces.current().dialog().showMessageDynamic(message);
    }
}
