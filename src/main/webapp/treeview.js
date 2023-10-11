$(document).ready(function() {
        	 $('.span').siblings("ul.grand").hide();
            $('.span').click(function() {
                $(this).siblings("ul").toggle();
            });
        });

const treeItems = document.querySelectorAll('.span'); // Get all the text elements
const prepositions = [];
treeItems.forEach(item => {
    prepositions.push(item.textContent.trim().toLowerCase());
});
console.log(prepositions)
const prepositionInput = document.getElementById('prepositionInput');
const prepositionList = document.getElementById('prepositionList');
window.onload = function() {
        var paragraphs = document.querySelectorAll('p + ul'); // Select all ul elements that follow a p element
        paragraphs.forEach(function(ul) {
            var precedingP = ul.previousElementSibling;
            if (precedingP.tagName === 'P') {
                precedingP.classList.add('triangle'); // Add the triangle class to the preceding p element
            }
        });
    };
prepositionInput.addEventListener('input', function() {
    const searchTerm = prepositionInput.value.trim().toLowerCase();
    
    prepositionList.innerHTML = ''; // Clear previous list items
    
    if (searchTerm === '') {
        prepositionList.classList.add('hide');
        //window.location.href = "dfs?depart="+"";
    } else {
        prepositionList.classList.remove('hide');
    }
    const matchingPrepositions = prepositions.filter(preposition => preposition.includes(searchTerm));
    
    matchingPrepositions.forEach(preposition => {
        const li = document.createElement('li');
        li.textContent = preposition;
        prepositionList.appendChild(li);
    });
});
prepositionList.addEventListener('click', function(event) {
    if (event.target.tagName === 'LI') {
        prepositionInput.value = event.target.textContent;
        prepositionList.classList.add('hide');
        console.log(event.target.textContent);
        //window.location.href = "searchServlet?depart="+event.target.textContent;
    }
    
});

prepositionInput.addEventListener('keydown', function(event) {
    if (event.key === 'Enter' && prepositionList.querySelector('li:not(.hide)')) {
        prepositionInput.value = prepositionList.querySelector('li:not(.hide)').textContent;
        prepositionList.classList.add('hide');
        //window.location.href = "searchServlet?depart="+prepositionList.querySelector('li:not(.hide)').textContent;
    }
});
