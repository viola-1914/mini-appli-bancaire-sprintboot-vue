<template>
   
    
<div class="Container">

     
    <div class="beta">
        <input type="text" placeholder="entrez un id" v-model="nbr">
        <button @click="UserById">utilisateurs</button>
    </div>

    <div class="beti">
        <input type="text" placeholder="entrez un id" v-model="idsupri">
        <button @click="supprim">Supprimer</button>
    </div>

    <div v-if="util">
   <p><strong>Nom:</strong>{{ util. firstName}}</p>
   <p><strong>Prenom:</strong>{{ util.lastName}}</p>
   <p><strong>email:</strong>{{ util.  email}}</p>
   <p><strong>phone:</strong>{{ util. phone}}</p>
   <p><strong>address:</strong>{{ util. address}}</p>
   <p><strong>genre:</strong>{{ util. gender}}</p>
   <p><strong>mot de passe:</strong>{{ util. password}}</p>
    </div>
    <h3>Liste des utilisateurs</h3>
    
        <table>
            <thead>
                <tr><th>Noms</th>
                <th>prenoms</th>
                <th>email</th>
                <th>phone</th>
                <th>address</th>
                <th>genre</th>
                <th>mot de passe</th>
                
            </tr>
            </thead>
            <tbody>
        <tr v-for="use in user"><td>{{ use. firstName}}</td><td>{{ use. lastName}}</td> <td>{{ use. email}}</td> <td>{{ use. phone}}</td>
        <td>{{ use.address}}</td> <td>{{ use.gender}}</td> <td>{{ use.password}}</td></tr>
            </tbody>
            <tfoot>
    
            </tfoot>
        </table>
</div>
    
</template>

<script setup>
import { ref } from 'vue';
import { onMounted } from 'vue';

let user = ref([])
let util = ref(null)
let nbr = ref()
let idsupri = ref()
function listUser(){
   const API  = 'http://localhost:8091/api/user/all'
    fetch(API).then(res => res.json()).then(data => user.value = data

    )
    
}
onMounted(() => {
listUser()
})
function UserById(e){
    e.preventDefault();
    
   const API  = `http://localhost:8091/api/user/id/${nbr.value}`
    fetch(API).then(res => res.json()).then(data => util.value = data

    )
}
function supprim(e){
e.preventDefault
const API = `http://localhost:8091/api/user/delete/${idsupri.value}`
fetch(API , {
    method:"DELETE"

}).then(res => {
    if (res.ok) {
      alert("✅ Suppression réussie !");
    } else {
      alert("❌ Échec de la suppression (erreur côté serveur).");
    }
  })
  .catch(err => {
    alert("⚠️ Erreur réseau ou serveur injoignable !");
    console.error(err);
  });

}

</script>

<style  scoped>
*{
    margin: 0;
}
.Container{
    max-width: 500px;
    width: 100%;
    display: flex;
    justify-content: center;
flex-direction: column;
margin: auto;
}
.beta{
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 10px;
    margin-bottom: 10px;
}
.beti{
display: flex;
    justify-content: center;
    align-items: center;
    gap: 10px;
    margin-bottom: 10px;
}
.beti button{
    background-color: red;
    color: white;
    padding: 5px;
    border-radius: 5px;
    border: 1px solid red;
}
input{
    width: 50%;
    padding: 5px;
    border-radius: 5px;
}
.beta button {
    background-color: black;
    color: white;
    padding: 5px;
    border-radius: 5px;
    border: 1px solid black;
}
table{
    border: 1px solid red;
    border-collapse: collapse;
}
td, th{
    padding: 5px;
    border: 1px solid black;
}
tr:hover{
background-color: rgb(233, 121, 121);
}
th{
    background-color: gray;
}
.Container  h3{
    text-align: center;
}
</style>