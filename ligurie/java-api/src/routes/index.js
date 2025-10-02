import Create from "../pages/Create.vue";
import Delete from "../pages/Delete.vue";
import Liste from "../pages/Liste.vue";
import Update from "../pages/Update.vue";

export const routes =  [
    {path:'/',
        name:'acceuil',
        component:Delete
    },
    {path:'/create',
        name:'create',
        component:Create
    },
    {path:'/update',
        name:'update',
        component:Update
    },
    {path:'/all',
        name:'all',
        component:Liste
    }
]