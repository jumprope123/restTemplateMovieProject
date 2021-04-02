function goView(i) {
    $('#listDiv'+i).on('click',function () {
        $('#listForm'+i).attr('method','post');
        $('#listForm'+i).attr('action','/view');
        $('#listForm'+i).submit();
    })
}