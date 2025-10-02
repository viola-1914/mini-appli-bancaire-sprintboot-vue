<template>
    <button @click="UserById">utilisateurs</button>
    <input type="text" placeholder="entrez un id" v-model="nbr">
    

    <div v-if="util">
   <p><strong>Nom:</strong>{{ util. firstName}}</p>
   <p><strong>Prenom:</strong>{{ util.lastName}}</p>
   <p><strong>email:</strong>{{ util.  email}}</p>
   <p><strong>phone:</strong>{{ util. phone}}</p>
   <p><strong>address:</strong>{{ util. address}}</p>
   <p><strong>genre:</strong>{{ util. gender}}</p>
   <p><strong>mot de passe:</strong>{{ util. password}}</p>
    </div>
<div class="Container">
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
        <tr v-for="use in user"><td>{{ use. firstName}}</td><td>{{ use. email}}</td> <td>{{ use. lastName}}</td> <td>{{ use. phone}}</td>
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
function listUser(){
   const API  = 'http://localhost:8091/api/user/all'
    fetch(API).then(res => res.json()).then(data => user.value = data

    )
    
}
onMounted(() => {
listUser()
})
function UserById(){
   const API  = `http://localhost:8091/api/user/id/${nbr.value}`
    fetch(API).then(res => res.json()).then(data => util.value = data

    )
}


</script>

<style  scoped>
*{
    margin: 0;
}
.Container{
    max-width: 300px;
    width: 100%;
    display: flex;
    justify-content: center;
flex-direction: column;
margin: auto;
    
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