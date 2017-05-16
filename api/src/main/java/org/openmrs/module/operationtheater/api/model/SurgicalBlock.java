package org.openmrs.module.operationtheater.api.model;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Location;
import org.openmrs.Provider;

import java.util.*;

public class SurgicalBlock extends BaseOpenmrsData {

    private Integer id;
    private Provider provider;
    private Location location;
    private Date startDatetime;
    private Date endDatetime;
    private Set<SurgicalAppointment> surgicalAppointments;


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    public Date getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(Date endDatetime) {
        this.endDatetime = endDatetime;
    }

    public Set<SurgicalAppointment> getSurgicalAppointments() {
        if (surgicalAppointments == null) {
            surgicalAppointments = new TreeSet<>();
        }
        return surgicalAppointments;
    }

    public void setSurgicalAppointments(Set<SurgicalAppointment> surgicalAppointments) {
        this.surgicalAppointments = surgicalAppointments;
    }
}
