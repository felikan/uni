let form = document.getElementById("eingabeForm");
let input = document.getElementById("eingabe");
let ausgabe = document.getElementById("ausgabe");
let item;
let data;

if (localStorage.length == 0) {
  localStorage.setItem("zaehler", 0);
}

for (let i = 0; i < localStorage.length; i++) {
  if (localStorage.key(i) != "zaehler") {
    let id = localStorage.key(i);
    let wert = localStorage[id];
    add({ id: id, eingabe: wert });
  }
}

form.addEventListener("submit", (e) => {
  e.preventDefault();
  let preventHtmlInjection =
    !input.value.includes(">") &&
    !input.value.includes('"') &&
    !input.value.includes("'");

  if (input.value && preventHtmlInjection) {
    localStorage.setItem(`${localStorage["zaehler"]}`, `${input.value}`);
    data = { eingabe: input.value, id: localStorage["zaehler"] };
    localStorage["zaehler"]++;
    add(data);
  } else {
    console.log("ungültige Eingabe");
  }
  input.value = "";
  input.focus();
});

function add(data) {
  item = document.createElement("li");
  item.innerHTML = `<form id="changeForm">
                    <input type="checkbox" id="checkbox">
                    <p>${data.eingabe}</p>
                    <button class="${data.id}" type="button" id="buttonDelete" 
                    onClick="deleteItem(this.className)">löschen</button>
                    </form>`;
  item.className = data.id;
  ausgabe.appendChild(item);
  window.scrollTo(0, document.body.scrollHeight);
}

function deleteItem(id) {
  item = document.getElementsByClassName(id)[0];
  item.remove();
  localStorage.removeItem(`${id}`);
}
