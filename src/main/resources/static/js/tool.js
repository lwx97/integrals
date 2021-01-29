/**
 * 获取系统路径
 * @returns {string}
 */
function getRootPath(){
//获取当前网址
    var curWwwPath=window.document.location.href;
//获取主机地址之后的目录
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
//获取主机地址
    var localhostPaht=curWwwPath.substring(0,pos);
//获取带"/“的项目名
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return(localhostPaht+projectName+"/");
}

/**
 * 通过角色获取菜单
 */
getRoleMenu = function () {

}