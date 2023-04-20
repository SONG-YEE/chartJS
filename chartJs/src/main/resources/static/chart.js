// chart.js 구현
let chartAreat = document.getElementById('myChart').getContext('2d');

const myChart = new Chart(chartAreat, {
    type: 'line',
    
    data: {
        
        labels: ['10학년', '11학년', '12학년'],
        
        datasets: [
            {
                label: 'Parker',
                data: [12, 19, 3, 5, 2, 4],
                backgraoundColor: 'rgba(255, 99, 132, 0.2)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
                borderWidth: 1
            },

            {
                label: 'Alice',
                data: [12, 35, 3, 23, 56, 3],
                backgraoundColor: 'rgba(233, 93, 231, 2)',
                borderColor: 'rgba(233, 93, 231, 2)',
                borderWidth: 1
            },

            {
                label: '',
                data: [20, 25, 30, 35, 40, 45],
                type: 'bar'
            }
        ]

    },

    options: {
        scales: {
            y: {
                //stacked: true,
                beginAtZero: true
            }
        }
    }
});



// 학년별 학생 리스트 구현
var tabLabels = document.querySelectorAll("#tabs li");
var tabPanes = document.getElementsByClassName("tab-contents");

function activateTab(e) {
  e.preventDefault();
  
  // Deactivate all tabs
  tabLabels.forEach(function(label, index){
    label.classList.remove("active");
  });
  [].forEach.call(tabPanes, function(pane, index){
    pane.classList.remove("active");
  });
  
  // Activate current tab
  e.target.parentNode.classList.add("active");
  var clickedTab = e.target.getAttribute("href");
  document.querySelector(clickedTab).classList.add("active");
}

// Apply event listeners
tabLabels.forEach(function(label, index){
  label.addEventListener("click", activateTab);
});