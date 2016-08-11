package com.chenliuliu.mvptest.bean;

import java.util.List;

/**
 * Created by liuliuchen on 16/8/11.
 */
public class LoginBean {


    private String orgId;
    private String login_result;

    private LoginLogEntity loginLog;
    private String staffSts;
    private String userName;
    private String orgName;
    private String roleIds;

    private List<CatalogEntity> catalog;

    private List<MenuEntity> menu;

    private List<ShortcutMenuMVOsEntity> shortcutMenuMVOs;

    private List<OrgTreeEntity> orgTree;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getLogin_result() {
        return login_result;
    }

    public void setLogin_result(String login_result) {
        this.login_result = login_result;
    }

    public LoginLogEntity getLoginLog() {
        return loginLog;
    }

    public void setLoginLog(LoginLogEntity loginLog) {
        this.loginLog = loginLog;
    }

    public String getStaffSts() {
        return staffSts;
    }

    public void setStaffSts(String staffSts) {
        this.staffSts = staffSts;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public List<CatalogEntity> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<CatalogEntity> catalog) {
        this.catalog = catalog;
    }

    public List<MenuEntity> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuEntity> menu) {
        this.menu = menu;
    }

    public List<ShortcutMenuMVOsEntity> getShortcutMenuMVOs() {
        return shortcutMenuMVOs;
    }

    public void setShortcutMenuMVOs(List<ShortcutMenuMVOsEntity> shortcutMenuMVOs) {
        this.shortcutMenuMVOs = shortcutMenuMVOs;
    }

    public List<OrgTreeEntity> getOrgTree() {
        return orgTree;
    }

    public void setOrgTree(List<OrgTreeEntity> orgTree) {
        this.orgTree = orgTree;
    }

    public static class LoginLogEntity {
        private Object ipAddr;
        private Object loginLogId;
        private String loginTime;
        private Object loginTime_end;
        private Object loginTime_start;
        private Object login_name;
        private Object logoutTime;
        private Object logoutTime_end;
        private Object logoutTime_start;
        private Object macAddr;
        private Object sts;
        private Object stsdate;
        private String sysUserId;

        public Object getIpAddr() {
            return ipAddr;
        }

        public void setIpAddr(Object ipAddr) {
            this.ipAddr = ipAddr;
        }

        public Object getLoginLogId() {
            return loginLogId;
        }

        public void setLoginLogId(Object loginLogId) {
            this.loginLogId = loginLogId;
        }

        public String getLoginTime() {
            return loginTime;
        }

        public void setLoginTime(String loginTime) {
            this.loginTime = loginTime;
        }

        public Object getLoginTime_end() {
            return loginTime_end;
        }

        public void setLoginTime_end(Object loginTime_end) {
            this.loginTime_end = loginTime_end;
        }

        public Object getLoginTime_start() {
            return loginTime_start;
        }

        public void setLoginTime_start(Object loginTime_start) {
            this.loginTime_start = loginTime_start;
        }

        public Object getLogin_name() {
            return login_name;
        }

        public void setLogin_name(Object login_name) {
            this.login_name = login_name;
        }

        public Object getLogoutTime() {
            return logoutTime;
        }

        public void setLogoutTime(Object logoutTime) {
            this.logoutTime = logoutTime;
        }

        public Object getLogoutTime_end() {
            return logoutTime_end;
        }

        public void setLogoutTime_end(Object logoutTime_end) {
            this.logoutTime_end = logoutTime_end;
        }

        public Object getLogoutTime_start() {
            return logoutTime_start;
        }

        public void setLogoutTime_start(Object logoutTime_start) {
            this.logoutTime_start = logoutTime_start;
        }

        public Object getMacAddr() {
            return macAddr;
        }

        public void setMacAddr(Object macAddr) {
            this.macAddr = macAddr;
        }

        public Object getSts() {
            return sts;
        }

        public void setSts(Object sts) {
            this.sts = sts;
        }

        public Object getStsdate() {
            return stsdate;
        }

        public void setStsdate(Object stsdate) {
            this.stsdate = stsdate;
        }

        public String getSysUserId() {
            return sysUserId;
        }

        public void setSysUserId(String sysUserId) {
            this.sysUserId = sysUserId;
        }
    }

    public static class CatalogEntity {
        private String catalogName;
        private String createDate;
        private String isDisplay;
        private String menuCatalogId;
        private Object parentCatalogId;
        private String sts;
        private String stsDate;

        public String getCatalogName() {
            return catalogName;
        }

        public void setCatalogName(String catalogName) {
            this.catalogName = catalogName;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getIsDisplay() {
            return isDisplay;
        }

        public void setIsDisplay(String isDisplay) {
            this.isDisplay = isDisplay;
        }

        public String getMenuCatalogId() {
            return menuCatalogId;
        }

        public void setMenuCatalogId(String menuCatalogId) {
            this.menuCatalogId = menuCatalogId;
        }

        public Object getParentCatalogId() {
            return parentCatalogId;
        }

        public void setParentCatalogId(Object parentCatalogId) {
            this.parentCatalogId = parentCatalogId;
        }

        public String getSts() {
            return sts;
        }

        public void setSts(String sts) {
            this.sts = sts;
        }

        public String getStsDate() {
            return stsDate;
        }

        public void setStsDate(String stsDate) {
            this.stsDate = stsDate;
        }
    }

    public static class MenuEntity {
        private Object createDate;
        private String menuCatalogId;
        private Object menuCode;
        private Object menuDesc;
        private String menuId;
        private String menuName;
        private String menuUrl;
        private Object sortPosition;
        private Object sts;
        private Object stsDate;

        public Object getCreateDate() {
            return createDate;
        }

        public void setCreateDate(Object createDate) {
            this.createDate = createDate;
        }

        public String getMenuCatalogId() {
            return menuCatalogId;
        }

        public void setMenuCatalogId(String menuCatalogId) {
            this.menuCatalogId = menuCatalogId;
        }

        public Object getMenuCode() {
            return menuCode;
        }

        public void setMenuCode(Object menuCode) {
            this.menuCode = menuCode;
        }

        public Object getMenuDesc() {
            return menuDesc;
        }

        public void setMenuDesc(Object menuDesc) {
            this.menuDesc = menuDesc;
        }

        public String getMenuId() {
            return menuId;
        }

        public void setMenuId(String menuId) {
            this.menuId = menuId;
        }

        public String getMenuName() {
            return menuName;
        }

        public void setMenuName(String menuName) {
            this.menuName = menuName;
        }

        public String getMenuUrl() {
            return menuUrl;
        }

        public void setMenuUrl(String menuUrl) {
            this.menuUrl = menuUrl;
        }

        public Object getSortPosition() {
            return sortPosition;
        }

        public void setSortPosition(Object sortPosition) {
            this.sortPosition = sortPosition;
        }

        public Object getSts() {
            return sts;
        }

        public void setSts(Object sts) {
            this.sts = sts;
        }

        public Object getStsDate() {
            return stsDate;
        }

        public void setStsDate(Object stsDate) {
            this.stsDate = stsDate;
        }
    }

    public static class ShortcutMenuMVOsEntity {
        private String createDate;
        private String menuId;
        private String menuName;
        private String menuUrl;
        private String shortcutMenuId;
        private String sts;
        private String stsDate;
        private String sysUserId;

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getMenuId() {
            return menuId;
        }

        public void setMenuId(String menuId) {
            this.menuId = menuId;
        }

        public String getMenuName() {
            return menuName;
        }

        public void setMenuName(String menuName) {
            this.menuName = menuName;
        }

        public String getMenuUrl() {
            return menuUrl;
        }

        public void setMenuUrl(String menuUrl) {
            this.menuUrl = menuUrl;
        }

        public String getShortcutMenuId() {
            return shortcutMenuId;
        }

        public void setShortcutMenuId(String shortcutMenuId) {
            this.shortcutMenuId = shortcutMenuId;
        }

        public String getSts() {
            return sts;
        }

        public void setSts(String sts) {
            this.sts = sts;
        }

        public String getStsDate() {
            return stsDate;
        }

        public void setStsDate(String stsDate) {
            this.stsDate = stsDate;
        }

        public String getSysUserId() {
            return sysUserId;
        }

        public void setSysUserId(String sysUserId) {
            this.sysUserId = sysUserId;
        }
    }

    public static class OrgTreeEntity {
        private String id;
        private String text;
        private String state;
        private AttributesEntity attributes;
        private List<ChildrenEntity> children;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public AttributesEntity getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesEntity attributes) {
            this.attributes = attributes;
        }

        public List<ChildrenEntity> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenEntity> children) {
            this.children = children;
        }

        public static class AttributesEntity {
            private Object leaderRoleId;

            public Object getLeaderRoleId() {
                return leaderRoleId;
            }

            public void setLeaderRoleId(Object leaderRoleId) {
                this.leaderRoleId = leaderRoleId;
            }
        }

        public static class ChildrenEntity {
            private String id;
            private String text;
            private String state;
            /**
             * leaderRoleId : null
             */

            private AttributesEntity attributes;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public AttributesEntity getAttributes() {
                return attributes;
            }

            public void setAttributes(AttributesEntity attributes) {
                this.attributes = attributes;
            }

            public static class AttributesEntity {
                private Object leaderRoleId;

                public Object getLeaderRoleId() {
                    return leaderRoleId;
                }

                public void setLeaderRoleId(Object leaderRoleId) {
                    this.leaderRoleId = leaderRoleId;
                }
            }
        }
    }
}
