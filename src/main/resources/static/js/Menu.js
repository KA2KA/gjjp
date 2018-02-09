var Menu = (function () {
    /**
     * 初始化菜单界面
     */
    initMenu = function () {
        $.ajax({
            type: 'POST',
            url: '',
            dataType: 'json',
            data: {},
            success: function (jsonData) {
                var data = JSON.parse(jsonData);
                $.each(data, function (i, n) {
                    $('#nav_menu').accordion('add', {
                        title: n.text,
                        selected: false,
                        iconCls: n.iconCls,
                        content: '<ul id="nav_menu_panel' + n.id + '" class="easyui-tree" ' +
                        'data-options="onClick:function(node){UserAction.Method.openTab(node);}"></ul>'
                    }).accordion({
                        onSelect: function (title, index) {
                            if ($('#nav_menu_panel' + data[index].id).children().length == 0) {
                                $.ajax({
                                    type: 'POST',
                                    url: 'listMenuTreeByUser.action',
                                    dataType: 'json',
                                    data: {
                                        id: data[index].id
                                    },
                                    success: function (data2Json) {
                                        var data2 = JSON.parse(data2Json);
                                        $('#nav_menu_panel' + data[index].id).empty();
                                        $.each(data2, function (i2, n2) {
                                            $('#nav_menu_panel' + data[index].id).tree('append', {
                                                data: [{
                                                    id: n2.id,
                                                    text: n2.text,
                                                    iconCls: n2.iconCls,
                                                    attributes: n2.attributes
                                                }]
                                            });
                                        });
                                    },
                                    error: function () {
                                        $.messager.alert('提示', '获取操作菜单失败，请重新登陆', 'error');
                                    }
                                });
                            }
                        }
                    });
                });
            },
            error: function () {
                $.messager.alert('提示', '获取操作菜单失败，请重新登陆', 'error');
            }
        });
    };

    return {
        initMenu: initMenu
    }
})();