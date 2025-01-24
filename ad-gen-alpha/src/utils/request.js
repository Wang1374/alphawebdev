import axios from 'axios'

const instance = axios.create({
    baseURL: '/api',
    timeout: 1000,
});
instance.interceptors.request.use(config => {
    return config;
}, error => {
    return error;
});
instance.interceptors.response.use(resp => {
    return resp.data;
},err => {
    return err;
});

const get = (url, data, config) => {
    return instance.get(url, {
        params: data
    }, {
        ...config
    });
}
const post = (url, data, config) => {
    return instance.post(url, {
        ...data
    }, {
        ...config
    });
};
export {
    get,
    post
}