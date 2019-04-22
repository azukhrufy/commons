/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sakaiproject.commons.api.datamodel;

/**
 *
 * @author Azukhrufy
 */
import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Stack;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;

import org.apache.commons.lang.StringEscapeUtils;
import org.sakaiproject.commons.api.CommonsManager;
import org.sakaiproject.entity.api.Entity;
import org.sakaiproject.entity.api.ResourceProperties;
import org.sakaiproject.util.BaseResourceProperties;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import lombok.Getter;
import lombok.Setter;


public class Like{
    
    @Getter @Setter
    private String postId;

    

}
