document.getElementById('btn').addEventListener('click', function() {
      // /syain/management 경로로 이동
      window.location.href = '/syain/management';
  });


/*  $(document).ready(function() {
    $('#btn').click(function() {
        // 검색 조건 데이터 가져오기
        var company = $('select[name="syozokuKaisya"]').val();  // 'syozokuKaisya'로 수정
        var name = $('#name').val();  // 이름 입력값
        var syokugyoKind = $('select[name="syokugyoKind"]').val();  // 직업 종류
        var employment = $('#employment').is(':checked');  // 재직 여부 체크박스
        var unemployed = $('#unemployed').is(':checked');  // 퇴사 여부 체크박스

        // Ajax 요청
        $.ajax({
            url: '/myInfo',  // SyainController에서 처리할 URL
            type: 'POST',
            data: {
                lastNameKanji: name,           // 이름
                syokugyoKind: syokugyoKind,    // 직업 종류
                employment: employment,        // 재직 여부
                unemployed: unemployed         // 퇴사 여부
            },
            success: function(response) {
                // 성공 시 받은 데이터를 처리하여 화면에 표시
                $('table').find('tr:not(:first)').remove();  // 테이블 초기화 (헤더 제외)

                $.each(response.syain, function(index, syain) {
                    var row = '<tr>' +
                                '<td>' + syain.syozokuKaisya + '</td>' +
                                '<td>' + syain.firstNameKanji + ' ' + syain.lastNameKanji + '</td>' +
                                '<td>' + (syain.seibetu ? '男' : '女') + '</td>' +
                                '<td>' + syain.syokugyoKind + '</td>' +
                                '<td>' + syain.nyuusyaDate + '</td>' +
                                '<td>' + syain.taisyaDate + '</td>' +
                                '<td style="color:blue;">更新 削除</td>' +
                              '</tr>';
                    $('table').append(row);
                });

                // 件数 업데이트
                $('span').eq(1).text(response.syain.length + '件');
            },
            error: function(xhr, status, error) {
                alert("データの取得に失敗しました: " + error);
            }
        });
    });
}); */
