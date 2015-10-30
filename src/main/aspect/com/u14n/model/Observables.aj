/**
 * 
 */
package com.u14n.model;

import com.damnhandy.aspects.bean.Observable;
import com.damnhandy.aspects.bean.Constrained;

/**
 * @author Klaus Wenger
 */
public aspect Observables {
    declare @type : com.u14n.model..*Bean : @Observable;
    declare @field : String com.u14n.model..UserBean.password : @Constrained;
}
