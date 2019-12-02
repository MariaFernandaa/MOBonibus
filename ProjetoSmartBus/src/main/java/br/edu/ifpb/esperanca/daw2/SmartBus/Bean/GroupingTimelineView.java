package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;
import org.primefaces.component.timeline.TimelineUpdater;
import org.primefaces.event.timeline.TimelineModificationEvent;
import org.primefaces.model.timeline.TimelineEvent;
import org.primefaces.model.timeline.TimelineGroup;
import org.primefaces.model.timeline.TimelineModel;

@Named("groupingTimelineView")
@ViewScoped
public class GroupingTimelineView implements Serializable {
   
    private TimelineModel model;
 
    @PostConstruct
    protected void initialize() {
        // create timeline model
        model = new TimelineModel();
 
        // create groups
        TimelineGroup group1 = new TimelineGroup("id1", ("10"));
        TimelineGroup group2 = new TimelineGroup("id2", ("11"));
        TimelineGroup group3 = new TimelineGroup("id3", ("12"));
        TimelineGroup group4 = new TimelineGroup("id4", ("13"));
        TimelineGroup group5 = new TimelineGroup("id5", ("14"));
        TimelineGroup group6 = new TimelineGroup("id6", ("15"));
        // add groups to the model
        
        model.addGroup(group1);
        model.addGroup(group2);
        model.addGroup(group3);
        model.addGroup(group4);
        model.addGroup(group5);
        model.addGroup(group6);
 
        int ano = 2000;
        // iterate over groups
        for (int j = 1; j <= 6; j++) {
            // iterate over events in the same group
            for (int i = 0; i < 6; i++) {
                Date startDate = (new GregorianCalendar(ano++,10,20)).getTime();
                Date endDate = (new GregorianCalendar(ano++,10,20)).getTime();
        
            
                model.add(new TimelineEvent("Teste", startDate, endDate, true, "id" + j));
            }
        }
    }
 
    public TimelineModel getModel() {
        return model;
    }
 
 
}