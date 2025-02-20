package org.apache.iotdb.admin.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @anthor fyx 2021/5/25
 */

@Data
public class Connection implements Serializable {

    private Integer id;
    private String host;
    private Integer port;
    private String username;
    private String password;
    private String alias;
    private Integer userId;

}
