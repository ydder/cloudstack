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

import com.cloud.api.BaseAsyncCmd;
import com.cloud.api.BaseCmd.Manager;
import com.cloud.api.Implementation;
import com.cloud.api.Parameter;

@Implementation(method="rebootSystemVM", manager=Manager.ManagementServer)
public class RebootSystemVmCmd extends BaseAsyncCmd {
	public static final Logger s_logger = Logger.getLogger(RebootSystemVmCmd.class.getName());

    private static final String s_name = "rebootsystemvmresponse";
    
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

//    public List<Pair<String, Object>> execute(Map<String, Object> params) {
//	    Long systemVmId = (Long)params.get(BaseCmd.Properties.ID.getName());
//	    
//	    // verify parameters
//        VMInstanceVO systemVm = getManagementServer().findSystemVMById(systemVmId);
//        if (systemVm == null) {
//        	throw new ServerApiException (BaseCmd.PARAM_ERROR, "unable to find a system vm with id " + systemVmId);
//        }
//        
//	    long jobId = getManagementServer().rebootSystemVmAsync(systemVmId.longValue());
//        if(jobId == 0) {
//        	s_logger.warn("Unable to schedule async-job for RebootSystemVMCommand");
//        } else {
//	        if(s_logger.isDebugEnabled())
//	        	s_logger.debug("RebootSystemVMCommand has been accepted, job id: " + jobId);
//        }
//	    
//	    List<Pair<String, Object>> returnValues = new ArrayList<Pair<String, Object>>();
//	    returnValues.add(new Pair<String, Object>(BaseCmd.Properties.JOB_ID.getName(), Long.valueOf(jobId))); 
//	    return returnValues;
//    }

	@Override
	public String getResponse() {
		// TODO Auto-generated method stub
		return null;
	}
}
