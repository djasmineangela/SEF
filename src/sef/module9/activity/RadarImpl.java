package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of a Radar 
 * 
 *
 */
public class RadarImpl implements Radar{
    List <RadarContact> radarList;

	
	/**
	 *  Constructs a new Radar 
	 */
	public RadarImpl(){
		radarList = new ArrayList<>();
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
	 */
	public RadarContact addContact(RadarContact contact) {
	    for (RadarContact radarContact : radarList) {
            if(radarContact.getContactID() == radarContact.getContactID()) {
                radarContact.setContactID(radarContact.getContactID());
                return radarContact;
            }
        }
	    
	    radarList.add(contact);
		return contact;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContact(java.lang.String)
	 */
	public RadarContact getContact(String id) {
	    for (RadarContact radarContact : radarList) {
            if(radarContact.getContactID() == id) {
                return radarContact;
            }
        }
		return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContactCount()
	 */
	public int getContactCount() {
		
		return radarList.size();
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#removeContact(java.lang.String)
	 */
	public RadarContact removeContact(String id) {
		for (RadarContact radarContact : radarList) {
            if(radarContact.getContactID() == id) {
                radarList.remove(radarList.indexOf(radarContact));
            }
        }
		return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts()
	 */
	public List<RadarContact> returnContacts() {
		return radarList;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
	 */
	public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {

		return null;
	}

	
}
