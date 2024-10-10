 document.getElementById('btn').addEventListener('click', function() {
            var lastNameKanji = document.getElementById('lastNameKanji').value;

            // 값이 비어있으면 경고창 표시
            if (!lastNameKanji) {
                alert("社員名を入力してください。");
                return;
            }

            
        });
        
    document.getElementById('delete').addEventListener('click', function(event) {
        // 기본 링크 이동을 방지합니다.
        event.preventDefault();

        var result = confirm("社員情報を削除しますか？");
        if (result) {
            // 확인 버튼을 클릭했을 때 해당 URL로 이동
            var deleteUrl = this.getAttribute('href'); // th:href에서 URL 가져오기
            window.location.href = deleteUrl; // 해당 URL로 이동
        } else {
            // 취소 버튼을 클릭했을 때 실행할 코드
            alert("削除をキャンセルしました。");
        }
    });


