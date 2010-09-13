/**
 *  Copyright (C) 2010 Cloud.com, Inc.  All rights reserved.
 * 
 * This software is licensed under the GNU General Public License v3 or later.
 * 
 * It is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.cloud.api.commands;

import org.apache.log4j.Logger;

import com.cloud.api.BaseCmd;
import com.cloud.api.BaseCmd.Manager;
import com.cloud.api.Implementation;
import com.cloud.api.Parameter;

@Implementation(method="deleteVolume", manager=Manager.StorageManager)
public class DeleteVolumeCmd extends BaseCmd {
	public static final Logger s_logger = Logger.getLogger(DeleteVolumeCmd.class.getName());
    private static final String s_name = "deletevolumeresponse";

    /////////////////////////////////////////////////////
    //////////////// API parameters /////////////////////
    /////////////////////////////////////////////////////

    @Parameter(name="id", type=CommandType.LONG, required=true)
    private Long id;


    /////////////////////////////////////////////////////
    /////////////////// Accessors ///////////////////////
    /////////////////////////////////////////////////////

    public Long getId() {
        return id;
    }


    /////////////////////////////////////////////////////
    /////////////// API Implementation///////////////////
    /////////////////////////////////////////////////////

    public String getName() {
        return s_name;
    }

    public static String getResultObjectName() {
    	return "volume";
    }
    
//    @Override
//    public List<Pair<String, Object>> execute(Map<String, Object> params) {
//    	Account account = (Account) params.get(BaseCmd.Properties.ACCOUNT_OBJ.getName());
//    	Long volumeId = (Long) params.get(BaseCmd.Properties.ID.getName());
//    	
//    	boolean isAdmin;
//    	if (account == null) {
//    		// Admin API call
//    		isAdmin = true;
//    	} else {
//    		// User API call
//    		isAdmin = isAdmin(account.getType());
//    	}
//
//    	// Check that the volume ID is valid
//    	VolumeVO volume = getManagementServer().findVolumeById(volumeId);
//    	if (volume == null) {
//    		throw new ServerApiException(BaseCmd.PARAM_ERROR, "Unable to find volume with ID: " + volumeId);
//    	}
//    	
//    	// If the account is not an admin, check that the volume is owned by the account that was passed in
//    	if (!isAdmin) {
//    		if (account.getId() != volume.getAccountId()) {
//                throw new ServerApiException(BaseCmd.PARAM_ERROR, "Unable to find volume with ID: " + volumeId + " for account: " + account.getAccountName());
//    		}
//    	} else if ((account != null) && !getManagementServer().isChildDomain(account.getDomainId(), volume.getDomainId())) {
//            throw new ServerApiException(BaseCmd.PARAM_ERROR, "Unable to delete volume with id " + volumeId + ", permission denied.");
//    	}
//
//    	try {
//    		getManagementServer().destroyVolume(volumeId);
//    		List<Pair<String, Object>> returnValues = new ArrayList<Pair<String, Object>>();
//            returnValues.add(new Pair<String, Object>(BaseCmd.Properties.SUCCESS.getName(), "true")); 
//
//            return returnValues;
//    	} catch (Exception ex) {
//    		throw new ServerApiException(BaseCmd.INTERNAL_ERROR, "Failed to delete volume: " + ex.getMessage());
//    	}
//    }


	@Override
	public String getResponse() {
		// TODO Auto-generated method stub
		return null;
	}
}
