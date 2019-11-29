package br.edu.ifpb.esperanca.daw2.SmartBus.Bean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
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
 
 
        // iterate over groups
        for (int j = 1; j <= 6; j++) {
            LocalDateTime referenceDate = LocalDateTime.of(2015, Month.DECEMBER, 14, 8, 0);
            // iterate over events in the same group
            for (int i = 0; i < 6; i++) {
                LocalDateTime startDate = referenceDate.plusHours(3 * (Math.random() < 0.2 ? 1 : 0));
 
                LocalDateTime endDate = startDate.plusHours(2 + (int) Math.floor(Math.random() * 4));
 
                referenceDate = endDate;
            }
        }
    }
 
    public TimelineModel getModel() {
        return model;
    }
 
 
}