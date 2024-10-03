

/* 検索 button */

        document.getElementById('btn').addEventListener('click', function() {
            // 체크박스의 체크 상태 확인
            var isEmploymentChecked = document.getElementById('employment').checked;
            var isUnemployedChecked = document.getElementById('unemployed').checked;

            // 두 체크박스가 모두 체크되지 않은 경우 경고창 표시
            if (!isEmploymentChecked && !isUnemployedChecked) {
                alert('在職または非在職のどちらかを選択してください。');
            } else {
                // 검색 실행 (여기에 검색 실행 로직을 넣을 수 있음)
                console.log('検索開始');
            }
        });







