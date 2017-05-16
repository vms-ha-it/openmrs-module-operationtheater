package org.openmrs.module.operationtheater.api.model;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;
import org.openmrs.util.OpenmrsUtil;
import org.springframework.util.StringUtils;

import java.util.*;

public class SurgicalAppointment extends BaseOpenmrsData {
    private Integer id;
    private Patient patient;
    private SurgicalBlock surgicalBlock;
    private Date actualStartDatetime;
    private Date actualEndDatetime;
    private String status;
    private String notes;
    private Integer sortWeight;
    private Set<SurgicalAppointmentAttribute> surgicalAppointmentAttributes;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public SurgicalBlock getSurgicalBlock() {
        return surgicalBlock;
    }

    public void setSurgicalBlock(SurgicalBlock surgicalBlock) {
        this.surgicalBlock = surgicalBlock;
    }

    public Date getActualStartDatetime() {
        return actualStartDatetime;
    }

    public void setActualStartDatetime(Date actualStartDatetime) {
        this.actualStartDatetime = actualStartDatetime;
    }

    public Date getActualEndDatetime() {
        return actualEndDatetime;
    }

    public void setActualEndDatetime(Date actualEndDatetime) {
        this.actualEndDatetime = actualEndDatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getSortWeight() {
        return sortWeight;
    }

    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public Set<SurgicalAppointmentAttribute> getSurgicalAppointmentAttributes() {
        if (surgicalAppointmentAttributes == null) {
            surgicalAppointmentAttributes = new TreeSet<>();
        }
        return surgicalAppointmentAttributes;
    }

    public void setSurgicalAppointmentAttributes(Set<SurgicalAppointmentAttribute> surgicalAppointmentAttributes) {
        this.surgicalAppointmentAttributes = surgicalAppointmentAttributes;
    }

    public List<SurgicalAppointmentAttribute> getActiveAttributes() {
        List<SurgicalAppointmentAttribute> attrs = new Vector<>();
        for (SurgicalAppointmentAttribute attr : getSurgicalAppointmentAttributes()) {
            if (!attr.getVoided()) {
                attrs.add(attr);
            }
        }
        return attrs;
    }
}
