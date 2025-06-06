
var projectName = '学术团队管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '会议通知',
	url: './pages/huiyitongzhi/list.jsp'
}, 

]

var adminurl =  "http://localhost:8080/jspm9gc9j/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"导师","menuJump":"列表","tableName":"daoshi"}],"menu":"导师管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"会议类型","menuJump":"列表","tableName":"huiyileixing"}],"menu":"会议类型管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除","确认收到"],"menu":"会议通知","menuJump":"列表","tableName":"huiyitongzhi"}],"menu":"会议通知管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论"],"menu":"学术周报","menuJump":"列表","tableName":"xueshuzhoubao"}],"menu":"学术周报管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除","学生签退"],"menu":"学生签到","menuJump":"列表","tableName":"xueshengqiandao"}],"menu":"学生签到管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"学生签退","menuJump":"列表","tableName":"xueshengqiantui"}],"menu":"学生签退管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除"],"menu":"确认收到","menuJump":"列表","tableName":"querenshoudao"}],"menu":"确认收到管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","确认收到"],"menu":"会议通知列表","menuJump":"列表","tableName":"huiyitongzhi"}],"menu":"会议通知模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论"],"menu":"学术周报","menuJump":"列表","tableName":"xueshuzhoubao"}],"menu":"学术周报管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除","学生签退"],"menu":"学生签到","menuJump":"列表","tableName":"xueshengqiandao"}],"menu":"学生签到管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"学生签退","menuJump":"列表","tableName":"xueshengqiantui"}],"menu":"学生签退管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","确认收到"],"menu":"会议通知列表","menuJump":"列表","tableName":"huiyitongzhi"}],"menu":"会议通知模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"会议通知","menuJump":"列表","tableName":"huiyitongzhi"}],"menu":"会议通知管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看"],"menu":"学术周报","menuJump":"列表","tableName":"xueshuzhoubao"}],"menu":"学术周报管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"学生签到","menuJump":"列表","tableName":"xueshengqiandao"}],"menu":"学生签到管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"学生签退","menuJump":"列表","tableName":"xueshengqiantui"}],"menu":"学生签退管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看"],"menu":"确认收到","menuJump":"列表","tableName":"querenshoudao"}],"menu":"确认收到管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","确认收到"],"menu":"会议通知列表","menuJump":"列表","tableName":"huiyitongzhi"}],"menu":"会议通知模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"导师","tableName":"daoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
