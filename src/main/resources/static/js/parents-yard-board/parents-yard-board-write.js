const $selectBox = $(".select-layout");
const $selectMenuBox = $(".select-menu-box");

$selectBox.mouseup(() => {
    $selectMenuBox.show();
});

$selectMenuBox.mouseleave(() => {
    $selectMenuBox.hide();
})


let $selectOption = $(".select-option");

$selectOption.each((i, e) => {

    $(e).click(() => {
        $selectOption.css("color", "#0c0c0c");
        $(".select-placeholder").css("color","#0c0c0c"); 
        $(".select-placeholder").text($(e).text()); 
        $(e).css("color", "#e1e1e1");
        $selectMenuBox.hide();       
    });
});
/* 카테고리 끝 */

const $selectBox2 = $(".select-layout2");
const $selectKidsCount = $(".select-kids-count");

$selectBox2.mouseup(() => {
    $selectKidsCount.show();
});

$selectKidsCount.mouseleave(() => {
    $selectKidsCount.hide();
})


let $selectOption2 = $(".select-option2");

$selectOption2.each((i, e) => {

    $(e).click(() => {
        $selectOption.css("color", "#0c0c0c");
        $(".select-placeholder2").css("color","#0c0c0c"); 
        $(".select-placeholder2").text($(e).text()); 
        $(e).css("color", "#e1e1e1");
        $selectKidsCount.hide();       
    });
});

const $inputTitle = $(".title");
const $maxCount = $(".text-max-count");
    // 제목 입력 js
$inputTitle.keyup(() => {
    $maxCount.text((40 - $inputTitle.val().length) + "자 남음");
});

/* 리셋 버튼 */
const $resetBtn = $(".reset-btn")[0];
const $fieldStudyTitle = $(".normal-text-input")[0];
const $fieldStudyDate = $(".field-study-date-input")[0];

$resetBtn.onclick = () => {
    $fieldStudyTitle.value = '';
    $fieldStudyDate.value = '';
};

