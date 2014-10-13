/*
 * 汇付天下有限公司
 * Copyright (c) 2006-2014 ChinaPnR,Inc.All Rights Reserved.
 */

package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author fei.xian
 * @version $Id: Person.java, v 0.1 Oct 10, 2014 23:25 fei.xian Exp $
 */

@Entity
public class Person extends Model {

    @Id
    public String id;

    public String name;

}
